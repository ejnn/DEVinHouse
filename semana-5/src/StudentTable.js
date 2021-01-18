import React from "react";
import { useState } from "react";

import { TextField } from "@material-ui/core";
import { Table, TableHead, TableBody, TableRow, TableCell } from "@material-ui/core";
import { Button } from "@material-ui/core";

const StudentsTable = ({ students, editStudentData }) => {
    const [filter, setFilter] = useState("");

    return (
	<>
	    <TextField fullWidth
		       label="Pesquisa por nome"
		       value={filter}/>

	    <Table>
		<TableHead>
		    <TableRow>
			<TableCell>Nome</TableCell>
			<TableCell>Data de nascimento</TableCell>
			<TableCell>Turma</TableCell>
			<TableCell>Telefone para emergências</TableCell>
			<TableCell>Em caso de emergência avisar</TableCell>
			<TableCell></TableCell>
		    </TableRow>
		</TableHead>

		<TableBody>
		    {students
		     .filter(student => student.name.includes(filter))
		     .map(student => {
		    	 return (
		    	     <TableRow key={student.id}>
		    		 <TableCell>{student.name}</TableCell>
		    		 <TableCell>{student.birthDate}</TableCell>
		    		 <TableCell>{student.classroom}</TableCell>
		    		 <TableCell>{student.emergencyPhoneNumber}</TableCell>
		    		 <TableCell>{student.notifyOnEmergency}</TableCell>
				 <TableCell>
				     <Button variant="contained"
					     color="primary"
					     onClick={() => editStudentData(student.id)}>Editar</Button>
				     <Button variant="contained" color="secondary">Excluir</Button>
				 </TableCell>
		    	     </TableRow>
		    	 );
		     })}
		</TableBody>
	    </Table>
	</>
    );
};


export default StudentsTable;
