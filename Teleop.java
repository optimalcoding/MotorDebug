package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Teleop {

    /* Public OpMode members. */
    public DcMotor frontRight;
    public DcMotor backRight;
    public DcMotor frontLeft;
    public DcMotor backLeft;

    /* Local OpMode members. */
    HardwareMap hwMap = null;
    public ElapsedTime runtime = new ElapsedTime();

    /* Constructor */
    public Teleop() {
    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Devices
        frontRight = hwMap.get(DcMotor.class, "frontRight");
        backLeft = hwMap.get(DcMotor.class, "backLeft");
        frontLeft = hwMap.get(DcMotor.class, "frontLeft");
        backRight = hwMap.get(DcMotor.class, "backRight");

        // Setting motor directions to turn
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.FORWARD);
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.FORWARD);
    }

    /* Method to run all motors at full power */
    public void runMotors() {
        frontLeft.setPower(1.0);
        backLeft.setPower(1.0);
        frontRight.setPower(1.0);
        backRight.setPower(1.0);
    }

    public void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
