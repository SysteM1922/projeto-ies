import "./Coach.css";
import { React, useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { Sidebar } from "../components/Sidebar";

export function Team() {
  const navigate = useNavigate();

  const coursesPage = () => {
    navigate("./Login");
  };
  const [team, setTeam] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/v1/team/1/players")
      .then((res) => res.json())
      .then((result) => {
        setTeam(result);
      });
  }, []);
  console.log("team: ", team);
  if (team.length === 0) return <div> Loading </div>;
  return (
    <div
      className="flex select-none"
      style={{
        fontFamily:
          'font-family: ui-sans-serif, system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji"',
      }}
    >
      <Sidebar />
      <div
        className="hero min-h-screen"
        style={{
          backgroundImage: `url("https://img.freepik.com/premium-photo/soccer-field-center-ball-top-view-background-sport-athletic-concept-3d-illustration-rendering_10307-2012.jpg?w=2000")`,
          backgroundPosition: "20%",
        }}
      >
        <div
          className="bg-secondary-content bg-opacity-[97%] rounded-lg overflow-hidden  gap-1 shadow-2xl border-[7px]"
          style={{ height: "800px", width: "1330px" }}
        >
          <div className="container pr-[4.55rem] mt-[1.675rem] w-[1330px] ">
            <div className="flex space-x-60 mx-auto w-full mb-10 justify-center">
              {team.map((player) => {
                console.log("player: ", player);
                <h3>{player}</h3>;
              })}
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
