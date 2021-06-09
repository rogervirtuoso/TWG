import React, {Component} from 'react';
import DepartmentItem from "./department/DepartmentItem";
import {connect} from "react-redux";
import {getDepartments} from "../actions/departmentActions";
import PropTypes from "prop-types";

class Dashboard extends Component {

    componentDidMount() {
        this.props.getDepartments();
    }

    render() {
        const {departments} = this.props.department;

        return (
            <div className="projects ml-5 mr-5">
                <div className="row">
                    <div className="col-md-12">
                        <h1 className="display-4 text-center">Department/Activities</h1>
                        {departments.map(department => (
                            <DepartmentItem key={department.id} department={department}/>
                        ))}
                    </div>
                </div>
            </div>
        );
    }
}

Dashboard.propTypes = {
    department: PropTypes.object.isRequired,
    getDepartments: PropTypes.func.isRequired

}

const mapStateToProps = state => ({
    department: state.department
});

export default connect(mapStateToProps, {getDepartments})(Dashboard);
