
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.constants.ElevatorConstants;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DigitalInput;

public class ElevatorSubsystem extends SubsystemBase{

    private CANSparkMax liftMotor;
    // private DigitalInput toplimitSwitch = new DigitalInput(ElevatorConstants.ELEVATOR_TOP_SWITCH_CHANNEL);
    // private DigitalInput bottomlimitSwitch = new DigitalInput(ElevatorConstants.ELEVATOR_BOTTOM_SWITCH_CHANNEL);
    

    public ElevatorSubsystem(){
        liftMotor = new CANSparkMax(ElevatorConstants.ELEVATOR_MOTOR_ID, MotorType.kBrushless);
        
        liftMotor.setInverted(true);
    }

    @Override
    public void periodic(){}

    public void set(double speed){
        liftMotor.set(speed);
    }

    public void up(){
        // if(!toplimitSwitch.get()) set(ElevatorConstants.ELEVATOR_UP_SPEED);
        // else set(0);
        set(ElevatorConstants.ELEVATOR_UP_SPEED);
    }

    public void down(){
        // if(!bottomlimitSwitch.get()) set(ElevatorConstants.ELEVATOR_DOWN_SPEED);
        // else set(0);
        set(ElevatorConstants.ELEVATOR_DOWN_SPEED);
    }
}
