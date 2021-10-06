package net.poollovernathan.brewery;

public interface IEnergyItem {
     int insertEnergy(int amount, boolean dry);
     int extractEnergy(int amount, boolean dry);
     boolean insertEnergyBlock(int amount, boolean dry);
     boolean extractEnergyBlock(int amount, boolean dry);
     int transferEnergy(IEnergyItem destination, boolean dry);
     boolean transferEnergyBlock(IEnergyItem destination, boolean dry);
     int peekEnergy();
}
