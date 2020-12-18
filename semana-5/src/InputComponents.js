import React from "react";
import { useState } from "react";

const LabeledInput = ({ label, ...props }) => {
  return (
    <label>
      {label}
      <input {...props} />
    </label>
  );
};

// unmask must be idempotent!
const MaskedInput = ({ mask, unmask, onChange, ...props }) => {
  const [value, setValue] = useState(
    props.value ? mask(unmask(props.value)) : ""
  );

  const handleInputChange = (event) => {
    const unmasked = unmask(event.target.value);
    setValue(mask(unmasked));

    const eventTargetProxyHandler = {
      get: (target, prop) => (prop == "value" ? unmasked : target[prop]),
    };

    const eventProxyHandler = {
      get: (target, prop) => {
        if (prop == "target") {
          return new Proxy(event.target, eventTargetProxyHandler);
        }

        return target[prop];
      },
    };

    onChange(new Proxy(event, eventProxyHandler));
  };

  return <LabeledInput onChange={handleInputChange} {...props} value={value} />;
};

const LabeledSelect = ({ label, options, ...props }) => {
  return (
    <>
      <label>
        {label}
        <select {...props}>
          {options.map((opt) => (
            <option key={opt} value={opt}>
              {opt}
            </option>
          ))}
        </select>
      </label>
    </>
  );
};

const maskPhoneNumber = (number) => {
  const length = number.length;
  let response = "";

  if (length >= 1) {
    response = response.concat(`(${number.slice(0, 2)}`);
  }
  if (length >= 3) {
    response = response.concat(`)${number.slice(2, 6)}`);
  }
  if (length >= 7) {
    response = response.concat(`-${number.slice(6)}`);
  }
  if (length == 11) {
    response = `(${number.slice(0, 2)})${number.slice(2, 7)}-${number.slice(
      7
    )}`;
  }

  return response;
};

const unmaskPhoneNumber = (number) => number.replace(/\(|\)|-/g, "");

const MaskedTel = ({ ...props }) => (
  <MaskedInput
    mask={maskPhoneNumber}
    unmask={unmaskPhoneNumber}
    onChange={props.onChange}
    type="tel"
    maxLength="14"
    pattern="\([0-9]{2}\)[0-9]{4,5}-[0-9]{4}"
    {...props}
  />
);

export { LabeledInput, MaskedInput, LabeledSelect, MaskedTel };
