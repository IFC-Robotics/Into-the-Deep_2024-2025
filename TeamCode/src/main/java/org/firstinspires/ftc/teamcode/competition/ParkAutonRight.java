package org.firstinspires.ftc.teamcode.competition;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous(name="Park (close to park side)", group="Competition")
public class ParkAutonRight extends LinearOpMode {

    @Override
    public void runOpMode() {
        Robot.init(this, false);

        waitForStart();
        Robot.drivetrain.strafe(3, 0.5);
        Robot.drivetrain.drive(-30,0.5);
        Robot.drivetrain.strafe(-3, 0.5);
    }
}