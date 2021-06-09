import {combineReducers} from "redux";
import errorReducer from "./errorReducer";
import departmentReducer from "./departmentReducer";

export default combineReducers({
    errors: errorReducer,
    department: departmentReducer
});
