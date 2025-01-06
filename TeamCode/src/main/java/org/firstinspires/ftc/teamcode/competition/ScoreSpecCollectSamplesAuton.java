package org.firstinspires.ftc.teamcode.competition;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous(name="score specimen then push samples", group="Competition")
public class ScoreSpecCollectSamplesAuton extends LinearOpMode {

    @Override
    public void runOpMode() {
        Robot.init(this, false);

        waitForStart();
        Robot.drivetrain.strafe(-6, 0.5);
        Robot.verticalLiftL.runToPosition("high", false, 0.3);
        Robot.verticalLiftR.runToPosition("high", false, 0.3);
        Robot.drivetrain.drive(32, 0.5);
        Robot.drivetrain.drive(2, 0.3);
        Robot.verticalLiftL.runToPosition("middle", true, 0.2);
        Robot.verticalLiftR.runToPosition("middle", true, 0.2);
        Robot.servoClawL.runToPosition("open", true);
        Robot.servoClawR.runToPosition("open", true);
        Robot.verticalLiftL.runToPosition("zero", false, 0.2);
        Robot.verticalLiftR.runToPosition("zero", false, 0.2);
        Robot.drivetrain.drive(-16, 0.5);
        Robot.drivetrain.strafe(30, 0.5);
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
