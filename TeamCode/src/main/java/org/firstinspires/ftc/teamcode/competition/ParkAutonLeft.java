package org.firstinspires.ftc.teamcode.competition;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous(name="Park (far from park side)", group="Competition")
public class ParkAutonLeft extends LinearOpMode {

    @Override
    public void runOpMode() {
        Robot.init(this, false);

        waitForStart();
        Robot.drivetrain.strafe(3, 0.5);
        Robot.drivetrain.drive(-76,0.5);
        Robot.drivetrain.strafe(-3, 0.5);
    }
}
