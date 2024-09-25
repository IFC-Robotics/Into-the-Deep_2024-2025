package org.firstinspires.ftc.teamcode.clubRush;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


@Autonomous(name="Handshake", group="Linear Opmode")
@Disabled
public class handshake extends LinearOpMode {



    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor armMotor;

    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize the hardware variables
        armMotor  = hardwareMap.get(DcMotor.class, "arm_motor");

        // Wait for the turn to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // run for 1 seconds
        while (runtime.seconds() < 0.55 && opModeIsActive()) {

            // Send calculated power to wheels
            armMotor.setPower(-0.32);

            // Show the elapsed game time and wheel power.
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Status", "Run Time: " + new String(String.valueOf(armMotor.isBusy())));
            telemetry.update();
        }
        while (runtime.seconds() < 1.5 && runtime.seconds() > 0.55  && opModeIsActive()) {

            // Send calculated power to wheels
            armMotor.setPower(0.1);

            // Show the elapsed game time and wheel power.
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.update();
        }
    }
}
