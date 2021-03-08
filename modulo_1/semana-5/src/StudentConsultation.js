import React from "react";
import { useState, useEffect } from "react";

import StudentForm from "./StudentForm.js";
import StudentTable from "./StudentTable.js";

const StudentConsultation = ({}) => {
    // state injection
    const [students, setStudents] = useState([]);

    // form state injection
    const [studentData, setStudentData] = useState({
	name: "",
	birthDate: "",
	guardiansName: "",
	guardiansPhoneNumber: "",
	notifyOnEmergency: "",
	emergencyPhoneNumber: "",
	hasDietaryRestriction: false,
	dietaryRestrictionDetails: "",
	mediaConsent: false,
	pickupAuthorized: [],
	classroom: "",
	additionalInformation: ""
    });

    const handleInputChange = (event) => {
	const target = event.target;
	setStudentData(data => ({
	    ...data,
	    [target.name]: target.value ? target.value : target.checked,
	}));
    };

    const editStudentData = (id) => {
	setStudentData(students[id-1]);
    };

    const saveStudentData = () => {
    };

    useEffect(() => {
	fetch("http://localhost:9000/alunos")
	    .then(res => res.json())
	    .then(json => {setStudents(json.alunos); console.log(json)});
    }, []);

    return (
	<>
	    <StudentForm formData={studentData} onChange={handleInputChange} />
	    <StudentTable students={students} editStudentData={editStudentData} />
	</>
    );
};

export default StudentConsultation;
