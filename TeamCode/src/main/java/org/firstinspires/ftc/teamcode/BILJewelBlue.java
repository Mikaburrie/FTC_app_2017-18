package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;


/**
 * Created by lpane on 12/19/2017.
 */


@Autonomous(name="BIL: Jewel Blue", group="BIL")
public class BILJewelBlue extends BILAutonomousCommon {

    @Override public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);

        robot.colorSensor.enableLed(true);

        // robot.colorSensor = hardwareMap.colorSensor.get("colorSensor");

        waitForStart();

        robot.jewelArm.setPosition(0.0);

        delay(2000);

        telemetry.addData("Red", robot.colorSensor.red());
        telemetry.addData("Blue", robot.colorSensor.blue());
        telemetry.update();

        if(robot.colorSensor.red() > robot.colorSensor.blue()){ //left side red

            setDriveMotors(-0.5, -0.5, 0.5, 0.5);
        } else if(robot.colorSensor.blue() > robot.colorSensor.red()) { //right side is red

            setDriveMotors(0.5, 0.5, -0.5, -0.5);
        }

        time.reset();

        delay(250);

        setAllDriveMotors(0);
        robot.jewelArm.setPosition(robot.jewelArmStartPosition);

        delay(500);

        setDriveMotors(1, -1, -1, 1);

        delay(1500);
    }
}
