import { hot } from "react-hot-loader/root";
import React from "react";

import mockServer from "./mockServer.js";
if (process.env.NODE_ENV == "development") {
    mockServer();
};

import StudentConsultation from "./StudentConsultation.js";

const App = () => {
    return <StudentConsultation/>
};

export default hot(App);
