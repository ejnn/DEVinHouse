import React from "react";
import { useState } from "react";
import "./Form.scss";

import { LabeledInput, MaskedTel, LabeledSelect } from "./InputComponents.js";

const StudentSignupForm = ({ ...props }) => {
  const [formData, setFormData] = useState(
    props.formData
      ? props.formData
      : {
          studentName: "",
          studentBirthDate: "",
          guardiansName: "",
          guardiansPhoneNumber: "",
          emergencyPhoneNumber: "",
          hasDietaryRestrictions: false,
          dietaryRestrictionsDetails: "",
          mediaConsent: false,
          classId: "",
        }
  );

  const handleInputChange = (event) => {
    const target = event.target;
    setFormData((formData) => ({
      ...formData,
      [target.name]: target.type == "checkbox" ? target.checked : target.value,
    }));
    console.log(target.name);
    console.log(target.type == "checkbox" ? target.checked : target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
  };

  return (
    <form onSubmit={handleSubmit}>
      <LabeledInput
        type="text"
        label="Nome"
        name="studentName"
        value={formData.studentName}
        onChange={handleInputChange}
      />
      <LabeledInput
        type="date"
        label="Data de Nascimento"
        name="studentBirthDate"
        value={formData.studentBirthDate}
        onChange={handleInputChange}
      />
      <LabeledInput
        type="text"
        label="Nome do Responsável pela criança"
        name="guardiansName"
        value={formData.guardiansName}
        onChange={handleInputChange}
      />
      <MaskedTel
        label="Telefone de Contato do Responsável pela criança"
        name="guardiansPhoneNumber"
        value={formData.guardiansPhoneNumber}
        onChange={handleInputChange}
      />
      <LabeledSelect
        label="Em caso de emergência avisar:"
        options={["Pais", "Tios", "Avós", "Padrinhos"]}
        onChange={handleInputChange}
      />
      <MaskedTel
        label="Telefone para Emergências"
        name="emergencyPhoneNumber"
        value={formData.emergencyPhoneNumber}
        onChange={handleInputChange}
      />
      <LabeledInput
        label="Possui Restrição Alimentar"
        type="checkbox"
        name="hasDietaryRestrictions"
        checked={formData.hasDietaryRestrictions}
        onChange={handleInputChange}
      />
      {formData.hasDietaryRestrictions ? (
        <LabeledInput
          label="Descrição das Restrições Alimentares"
          name="dietaryRestrictionsDetails"
          value={formData.dietaryRestrictionsDetails}
          type="text"
          onChange={handleInputChange}
        />
      ) : null}
      <LabeledInput
        label="Autorização de fotos e vídeos da criança para uso escolar"
        type="checkbox"
        name="mediaConsent"
        checked={formData.mediaConsent}
        onChange={handleInputChange}
      />
      <LabeledSelect
        label="Lista de autorizados a buscar a criança"
        options={["Pedro - Padrinho", "Maria - Tia"]}
      />
      <LabeledSelect
        label="Turma"
        name="classId"
        value={formData.classId}
        options={[101, 102]}
        onChange={handleInputChange}
      />
      <LabeledInput type="submit" value={"concluído"} />
    </form>
  );
};

export default StudentSignupForm;
