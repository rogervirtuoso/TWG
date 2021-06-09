import axios from "axios";
import {GET_DEPARTMENTS} from "./types";

export const getDepartments = () => async dispatch => {
    const res = await axios.get("http://localhost:8080/api/department/all");
    dispatch({
        type: GET_DEPARTMENTS,
        payload: res.data
    });
}
