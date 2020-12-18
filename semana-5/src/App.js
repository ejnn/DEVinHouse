import { hot } from "react-hot-loader/root";
import React from "react";

import StudentSignupForm from "./StudentSignupForm.js";
import ListFilter from "./ListFilter.js";
import StudentsList from "./StudentsList.js";

const studentsData = [
  {
    studentName: "Jesus",
    studentBirthDate: "0001-01-01",
    classId: "12",
    emergencyPhoneNumber: "99999999999",
    notifyOnEmergency: "Deus",
  },
];

const App = () => {
  return (
    <>
      <StudentSignupForm />
      <ListFilter />
      <StudentsList studentsData={studentsData} />
    </>
  );
};

export default hot(App);
