package org.firstinspires.ftc.teamcode.testing;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.robot.MotorClass;
import org.firstinspires.ftc.teamcode.robot.Robot;
import org.firstinspires.ftc.teamcode.robot.ServoClass;


@TeleOp(name="Test Teleop", group="Linear Opmode")

public class teleTestMotor extends LinearOpMode {

    // Declare OpMode members.
    private static MotorClass motorL;
    private static MotorClass motorR;
    private static ServoClass servo;
    private double servoPosition;
    private int height;

    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize the hardware variables
        motorL  = new MotorClass("motor", 0.01, 800, true);
        motorR  = new MotorClass("motor2", 0.01, 800, true);
//        servo  = new ServoClass("servo", "high", 0, "middle",0.5 ,"low",0.8, 0.01, 800, false);

        motorL.init(this);
        motorL.motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorR.init(this);
        motorR.motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        servo.init(this);

        // Wait for the turn to start (driver presses PLAY)
        waitForStart();

        while (opModeIsActive()) {
            // run forward when pressing a and backward when pressing b
            motorL.teleOp(gamepad1.right_stick_y, gamepad1.left_stick_y);
            motorR.teleOp(gamepad1.right_stick_y, gamepad1.left_stick_y);
//            if (gamepad2.y) {
//                motor.runToPosition(16200);
//                sleep(10000);
//            }
//            if (gamepad2.a) {
//                motor.runToPosition(300);
//                sleep(10000);
//            }
            telemetry.addData("Motor Left Power: ", motorL.motor.getPower());
            telemetry.addData("Motor Right Power: ", motorR.motor.getPower());
//            servo.teleOpManualMode(gamepad1.left_bumper,gamepad1.right_bumper);
//            telemetry.addData("ga: ", servo.servo.getPosition());
            telemetry.update();
//
//            motor.printData();
//            servo.printData();
//            telemetry.update();
        }
    }
}
