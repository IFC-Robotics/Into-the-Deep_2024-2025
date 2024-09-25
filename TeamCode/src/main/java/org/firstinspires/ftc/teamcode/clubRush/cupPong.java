package org.firstinspires.ftc.teamcode.clubRush;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;



@Autonomous(name="Cup Pong", group="Linear Opmode")
@Disabled
public class cupPong extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor cupMotor;

    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize the hardware variables
        cupMotor  = hardwareMap.get(DcMotor.class, "cup_motor");

        // Wait for the turn to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // run for 60 seconds
        while (runtime.seconds() < 30 && opModeIsActive()) {

            // Send calculated power to wheels
            cupMotor.setPower(0.2);

            // Show the elapsed game time and wheel power.
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.update();
        }
    }
}
