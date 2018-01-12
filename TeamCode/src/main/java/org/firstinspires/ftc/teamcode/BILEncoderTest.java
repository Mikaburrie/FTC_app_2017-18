package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by mikab_000 on 1/9/2018.
 */

@Autonomous(name="BIL: Encoder Test", group="BIL")
public class BILEncoderTest extends BILAutonomousCommon {

    @Override public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);

        waitForStart();

        telemetry.addData("Testing Front Left", "With encoder at 0.25 speed");
        telemetry.update();
        robot.motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.motorFrontLeft.setPower(0.25);
        delay(5000);
        setAllDriveMotors(0);
        delay(1000);

        telemetry.addData("Testing Front Left", "Without encoder at 0.25 speed");
        telemetry.update();
        robot.motorFrontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.motorFrontLeft.setPower(0.25);
        delay(5000);
        setAllDriveMotors(0);
        delay(1000);

        telemetry.addData("Testing Back Left", "With encoder at 0.25 speed");
        telemetry.update();
        robot.motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.motorBackLeft.setPower(0.25);
        delay(5000);
        setAllDriveMotors(0);
        delay(1000);

        telemetry.addData("Testing Back Left", "Without encoder at 0.25 speed");
        telemetry.update();
        robot.motorBackLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.motorBackLeft.setPower(0.25);
        delay(5000);
        setAllDriveMotors(0);
        delay(1000);

        telemetry.addData("Testing Front Right", "With encoder at 0.25 speed");
        telemetry.update();
        robot.motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.motorFrontRight.setPower(0.25);
        delay(5000);
        setAllDriveMotors(0);
        delay(1000);

        telemetry.addData("Testing Front Right", "Without encoder at 0.25 speed");
        telemetry.update();
        robot.motorFrontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.motorFrontRight.setPower(0.25);
        delay(5000);
        setAllDriveMotors(0);
        delay(1000);

        telemetry.addData("Testing Back Right", "With encoder at 0.25 speed");
        telemetry.update();
        robot.motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.motorBackRight.setPower(0.25);
        delay(5000);
        setAllDriveMotors(0);
        delay(1000);

        telemetry.addData("Testing Back Right", "Without encoder at 0.25 speed");
        telemetry.update();
        robot.motorBackRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.motorBackRight.setPower(0.25);
        delay(5000);
        setAllDriveMotors(0);
    }
}