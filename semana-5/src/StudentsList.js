import React from "react";

import { LabeledInput, MaskedTel } from "./InputComponents.js";

const StudentEntry = ({ studentData }) => {
  return (
    <li>
      <LabeledInput
        label="Nome"
        type="text"
        value={studentData.studentName}
        readOnly={true}
      />
      <LabeledInput
        label="Data de Nascimento"
        type="date"
        value={studentData.studentBirthDate}
        readOnly={true}
      />
      <LabeledInput
        label="Turma"
        type="text"
        value={studentData.classId}
        readOnly={true}
      />
      <MaskedTel
        label="Telefone para Emergências"
        value={studentData.emergencyPhoneNumber}
        onChange={() => {}}
        readOnly={true}
      />
      <LabeledInput
        label="Em caso de emergência avisar"
        type="text"
        value={studentData.notifyOnEmergency}
        readOnly={true}
      />
      <LabeledInput type="button" value="editar" />
      <LabeledInput type="button" value="deletar" />
    </li>
  );
};

const StudentsList = ({ studentsData }) => {
  return (
    <ul>
      {studentsData.map((studentData) => (
        <StudentEntry key={studentData.studentName} studentData={studentData} />
      ))}
    </ul>
  );
};

export default StudentsList;
