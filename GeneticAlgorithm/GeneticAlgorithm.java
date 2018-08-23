package geneticAlgorithm;
import java.util.*;
public class GeneticAlgorithm {

  private Random randomGenerator;

  public GeneticAlgorithm(){

    this.randomGenerator = new Random();

  }
public Population evolvePopulation(Population population){

  for(int i=0;i<population.size();i++){

    Individual firstIndividual = randomSelection(population);
    Individual secondIndividual = randomSelection(population);
    Individual newIndividual= crossover(firstIndividual, secondIndividual);

    newPopulation.saveIndividual(1, newIndividual);
  }

  for(int i = 0;i<newPopulation.size();++i){

    mutate(newPopulation.getIndividual(i));

  }

  return newPopulation;
}





  private Individual randomSelection(Population population){
    Population newPopulation = new Population(Constants.TOURNAMENT_SIZE);
    for(int i =0;i<Constants.TOURNAMENT_SIZE;i++){

      int randomIndex = (int) (Math.random() * population.size());
      newPopulation.saveIndividual(1, population.getIndividual(randomIndex));
    }
    Individual fittestIndividual = newPopulation.getFittestIndividual();
    return fittestIndividual;

  }

}
