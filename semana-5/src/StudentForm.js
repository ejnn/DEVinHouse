import React from "react";
import { useState, useEffect } from "react";

import { Button } from "@material-ui/core";
import { TextField } from "@material-ui/core";
import { Checkbox, FormControlLabel } from "@material-ui/core";
import { Select, MenuItem, InputLabel } from "@material-ui/core";
import { List, ListSubheader, ListItem, ListItemText } from "@material-ui/core";

const StudentForm = ({ formData, onChange }) => {
    const [classrooms, setClassrooms] = useState([]);

    useEffect(() => {
	fetch("http://localhost:9000/turmas")
	    .then(res => res.json())
	    .then(json => setClassrooms(json.turmas));
    }, []);

    return (
	    <form>
		<TextField fullWidth
			   name="name"
			   value={formData.name}
			   onChange={onChange}
			   label="Nome"/>

		<TextField fullWidth
			   name="birthDate"
			   value={formData.birthDate}
			   onChange={onChange}
			   label="Data de Nascimento"
			   type="date"/>

		<TextField fullWidth
			   name="guardiansName"
			   value={formData.guardiansName}
			   onChange={onChange}
			   label="Nome do Responsável"/>

		<TextField fullWidth
			   name="guardiansPhoneNumber"
			   value={formData.guardiansPhoneNumber}
			   onChange={onChange}
			   label="Telefone do Responsável"/>

		<Select value={formData.notifyOnEmergency}
			onChange={onChange}
			name="notifyOnEmergency">
		    {
			["", "Pais", "Tios", "Avós", "Padrinhos"]
			.map(relative => {
			    return (
				<MenuItem key={relative}
					  value={relative}>
				    {relative}
				</MenuItem>
			    );
			})
		    }
		</Select>

		<TextField fullWidth
			   name="emergencyPhoneNumber"
			   value={formData.emergencyPhoneNumber}
			   onChange={onChange}
			   label="Telefone para emergências"/>

		<FormControlLabel control={
				      <Checkbox name="hasDietaryRestriction"
						checked={formData.hasDietaryRestriction}
						onChange={onChange}/>
				  }
				  label="Possui restrição alimentar"
				  labelPlacement="start"/>

		{
		    formData.hasDietaryRestriction
			? <TextField fullWidth
				     multiline
				     name="dietaryRestrictionDetails"
				     value={formData.dietaryRestrictionDetails}
				     onChange={onChange}
				     label="Descrição das restrições alimentares"/>
		    : null
		}

		<FormControlLabel control={
				      <Checkbox name="mediaConsent"
				     		checked={formData.mediaConsent}
						onChange={onChange}/>
				  }
				  label="Autorização midiática"
				  labelPlacement="start"/>

		<List subheader={<ListSubheader disableGutters>
				     Autorizados a buscar a criança
				 </ListSubheader>}>
		    {
			formData.pickupAuthorized.map(name => {
			    return (
				<ListItem disableGutters key={name}>
				    <ListItemText primary={name}/>
				</ListItem>
			    );
			})
		    }
		</List>

		<Select value={formData.classroom}
			onChange={onChange}
			name="classroom">
		    {
			classrooms.map(classroom => {
			    return (
				<MenuItem key={classroom}
					  value={classroom}>
				    {classroom}
				</MenuItem>
			    );
			})
		    }
		</Select>

		<TextField fullWidth
			   multiline
			   name="additionalInformation"
			   value={formData.additionalInformation}
			   onChange={onChange}
			   label="Observações adicionais"/>
		<Button variant="contained" color="primary">Salvar</Button>
		<Button variant="contained" color="secondary">Excluir</Button>
	    </form>
    );
};

export default StudentForm;
