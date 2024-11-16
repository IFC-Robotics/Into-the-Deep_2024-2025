package org.firstinspires.ftc.teamcode.testing;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.Robot;

@Disabled
@TeleOp(name="Mechanisms Test", group="Competition")
public class mechanismsTest extends LinearOpMode {

    float pulleyRatio = 0.2f; //test
    float pulleySpeed;
    float launcherSpeed;

    @Override
    public void runOpMode() {

        telemetry.addLine("Initializing opMode...");
        telemetry.update();

        Robot.init(this, false);
        Robot.mode = "assist";

        waitForStart();

        telemetry.addLine("Executing opMode...");
        telemetry.update();

        while (opModeIsActive()) {

            Robot.verticalLift.teleOp(-gamepad2.right_stick_y, gamepad2.right_bumper, gamepad2.a, gamepad2.x, gamepad2.b, gamepad2.y);

            //disabled turbo mode for button mapping
            Robot.drivetrain.teleOp(-gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x, false/**gamepad1.right_bumper**/);

//            Robot.servoLR.teleOpManualMode(gamepad2.left_trigger > 0.2,gamepad2.right_trigger > 0.2);
//            Robot.servoUD1.teleOpManualMode(gamepad2.left_stick_y > 0.2,gamepad2.left_stick_y < -0.2);
//            Robot.servoUD2.teleOpManualMode(gamepad2.right_stick_y > 0.2,gamepad2.right_stick_y < -0.2);
//            Robot.servoDeposit.teleOpAssistMode(gamepad2.dpad_down,(gamepad2.dpad_left||gamepad2.dpad_right),gamepad2.dpad_up);

//            Robot.motorCollector.teleOp(gamepad1.right_trigger,-gamepad1.left_trigger);



//            Robot.servoLauncher.teleOpAssistMode(gamepad1.left_bumper,false,gamepad1.right_bumper);



        }
    }

    public void printRobotData() {

        telemetry.addLine("\nRobot data:\n");

        Robot.verticalLift.printData();

//        Robot.motorCollector.printData();

//        Robot.servoLR.printData();

//        Robot.servoUD1.printData();
//        Robot.servoUD2.printData();

        telemetry.update();

    }
}

/**
 * Controls
 * Gamepad1:
 * - left Stick: cardinal drivetrain
 * - right Stick: turning
 * - Left & Right Triggers: collector
 * -
 *
 *
 *
 **/