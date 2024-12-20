package org.firstinspires.ftc.teamcode.competition;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous(name="sample collection", group="Competition")
public class CollectSamplesAuton extends LinearOpMode {

    @Override
    public void runOpMode() {
        Robot.init(this, false);

        waitForStart();
        Robot.drivetrain.strafe(6, 0.5);
        Robot.drivetrain.drive(32,0.5);
        Robot.drivetrain.drive(-16, 0.5);
        Robot.drivetrain.strafe(34, 0.5);
        Robot.drivetrain.drive(28, 0.5);
        Robot.drivetrain.strafe(6, 0.5);
        Robot.drivetrain.drive(-44, 0.5);
        Robot.drivetrain.drive(44, 0.5);
        Robot.drivetrain.strafe(6, 0.5);
        Robot.drivetrain.drive(-44, 0.5);
        Robot.drivetrain.drive(44, 0.5);
        Robot.drivetrain.strafe(6, 0.5);
        Robot.drivetrain.drive(-44, 0.5);
    }
}