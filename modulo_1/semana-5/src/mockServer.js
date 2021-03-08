import { createServer, Model, Factory } from "miragejs";

function randomInt(max) {
    return Math.floor(Math.random() * Math.floor(max));
}

const r = () => randomInt(10**9).toString(36);

const mockServer = () => {
    createServer({
	models: {
	    aluno: Model,
	},

	factories: {
	    aluno: Factory.extend({
		name() {
		    return r();
		},
		
		birthDate: "2000-01-01",

		guardiansName() {
		    return r();
		},
		
		guardiansPhoneNumber() {
		    return r();
		},

		notifyOnEmergency() {
		    return ["Pais", "Tios", "Avós", "Padrinhos"][randomInt(4)];
		},

		emergencyPhoneNumber() {
		    return r();
		},
		
		hasDietaryRestriction() {
		    return randomInt(2) ? true : false;
		},
		
		dietaryRestrictionDetails() {
		    return r();
		},
		
		mediaConsent() {
		    return randomInt(2) ? true : false;
		},
		
		pickupAuthorized() {
		    return Array(randomInt(4)).fill(1).map(() => r());
		},

		classroom() {
		    return [ "101", "102", "201", "202", "301", "302" ][randomInt(6)];
		},
		
		additionalInformation() {
		    return r();
		},
	    }),
	},

	seeds(server) {
	    server.createList("aluno", randomInt(10));
	    //server.create("aluno",
	    //	    {
	    //		name: "Carlinhos",
	    //		birthDate: "2000-01-01",
	    //		guardiansName: "Carlão",
	    //		guardiansPhoneNumber: "00000000000",
	    //		notifyOnEmergency: [ "Carlão", "Carlota" ],
	    //		emergencyPhoneNumber: "48912341234",
	    //		hasDietaryRestriction: true,
	    //		dietaryRestrictionDetails: "Se recusa a comer manjericão",
	    //		mediaConsent: false,
	    //		pickupAuthorized: ["Carlão (pai)", "Carlos (irmão)"],
	    //		classroom: "101",
	    //		additionalInformation: "Não deixar na mesma turma que Jerry"
	    //	    })
	},

	routes() {
	    this.get("/alunos");

	    this.get("/alunos/:id");

	    this.get("/turmas", () => ({
		turmas: ["", "101", "102", "201", "202", "301", "302" ]
	    }));
	}
    })
};

export default mockServer;
