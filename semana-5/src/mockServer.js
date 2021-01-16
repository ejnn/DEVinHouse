import { createServer } from "miragejs";

const mockServer = () => {
    createServer({
	routes() {
	    this.get("/alunos", () => ({
		alunos: [
		    {
			name: "Carlinhos",
			birthDate: "0000-01-01",
			guardiansName: "Carlão",
			guardiansPhoneNumber: "00000000000",
			notifyOnEmergency: [ "Carlão", "Carlota" ],
			emergencyPhoneNumbers: { "Carlão": "48912341234", "Carlota": "48943214321" },
			hasDietaryRestriction: true,
			dietaryRestrictionDetails: "Se recusa a comer manjericão",
			mediaConsent: false,
			pickupAuthorized: ["Carlão (pai)", "Carlota (mãe)", "Carlos (irmão)"],
			classroom: 101,
			additionalInformation: "Não deixar na mesma turma que Jerry"
		    }
		]
	    })
		    );
	}
    })
};

export default mockServer;
