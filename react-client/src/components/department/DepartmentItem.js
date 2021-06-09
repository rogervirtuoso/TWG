import React, {Component} from 'react';

class DepartmentItem extends Component {
    render() {
        const {department} = this.props;
        return (
                <div className="card card-body bg-light mb-3">
                    <div className="row">

                        <div className="col-lg-12 text-center">
                            <h3>{department.name}</h3>
                        </div>
                    </div>
                        <div className={"row"}>
                            {department.departmentHours.map(departmentHours => (
                            <div className="col-lg-6 mb-auto">
                                <h5 className={"mt-5"}>{departmentHours.description}</h5>
                                <ul className="list-group">
                                        <li className="list-group-item board">
                                            <i className="fa fa-calendar"> Sunday: {departmentHours.sunday} hours</i>
                                        </li>
                                        <li className="list-group-item board">
                                            <i className="fa fa-calendar"> Monday: {departmentHours.monday} hours</i>
                                        </li>
                                        <li className="list-group-item board">
                                            <i className="fa fa-calendar"> Tuesday: {departmentHours.tuesday} hours</i>
                                        </li>
                                        <li className="list-group-item board">
                                            <i className="fa fa-calendar"> Wednesday: {departmentHours.wednesday} hours</i>
                                        </li>
                                        <li className="list-group-item board">
                                            <i className="fa fa-calendar"> Thursday: {departmentHours.thursday} hours</i>
                                        </li>
                                        <li className="list-group-item board">
                                            <i className="fa fa-calendar"> Friday: {departmentHours.friday} hours</i>
                                        </li>
                                        <li className="list-group-item board">
                                            <i className="fa fa-calendar"> Saturday: {departmentHours.saturday} hours</i>
                                        </li>
                                </ul>
                            </div>
                                ))}
                        </div>
            </div>);
    }
}

export default DepartmentItem;
