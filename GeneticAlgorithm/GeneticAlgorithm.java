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

private Individual crossover(Individual firstIndividual, Individual secondIndividual) {

  Individual newSolution = new Individual();

    for (int geneIndex = 0; geneIndex < Constants.GENE_LENGTH; ++geneIndex) {

        if (Math.random() <= Constants.UNIFORM_RATE) {
            newSolution.setGene(geneIndex, firstIndividual.getGene(geneIndex));
        } else {
            newSolution.setGene(geneIndex, secondIndividual.getGene(geneIndex));
        }
    }

    return newSolution;
}

private void mutate(Individual individual) {

    for (int geneIndex = 0; geneIndex < Constants.GENE_LENGTH; ++geneIndex) {

      if (Math.random() <= Constants.MUTATION_RATE) {
            int gene = randomGenerator.nextInt(10);
            individual.setGene(geneIndex, gene);
        }
    }
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
