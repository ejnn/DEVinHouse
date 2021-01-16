import { hot } from "react-hot-loader/root";
import React from "react";

import mockServer from "mockServer.js";
if (process.env.NODE_ENV == "development") {
    startServer();
};

const App = () => {
  return <div> Huzzah! </div>;
};

export default hot(App);
