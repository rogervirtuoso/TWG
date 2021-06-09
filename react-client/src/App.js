import './App.css';
import Dashboard from "./components/Dashboard";
import "bootstrap/dist/css/bootstrap.min.css"
import {BrowserRouter as Router, Route} from "react-router-dom";
import Header from "./components/layout/header";
import {Provider} from "react-redux";
import store from "./Store";

function App() {
    return (
        <Provider store={store}>
            <Router>
                <div className="App">
                    <Header/>
                    <Route exact path={"/dashboard"} component={Dashboard}/>
                </div>
            </Router>
        </Provider>
    );
}

export default App;
