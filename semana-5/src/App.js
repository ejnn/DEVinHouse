import { hot } from "react-hot-loader/root";
import React, { useState, useEffect } from "react";

import mockServer from "./mockServer.js";
if (process.env.NODE_ENV == "development") {
    mockServer();
};

const App = () => {
    useEffect(() => {
	fetch("http://localhost:9000/alunos")
	    .then(res => res.json())
	    .then(json => console.log(json));
    }, []);

  return <div> Huzzah! </div>;
};

export default hot(App);
