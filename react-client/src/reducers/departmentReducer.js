import {GET_DEPARTMENTS} from "../actions/types";

const initialState = {
    departments: [],
    department: {},

};

export default function (state = initialState, action) {
    switch (action.type) {
        case GET_DEPARTMENTS:
            return {
                ...state,
                departments: action.payload
            }
        default:
            return state;
    }
}
