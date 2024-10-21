package org.firstinspires.ftc.teamcode.competition;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous(name="Park", group="Competition")
public class ParkAuton extends LinearOpMode {

    @Override
    public void runOpMode() {
        Robot.init(this, false);

        waitForStart();
        Robot.drivetrain.drive(32,0.7);
    }
}
