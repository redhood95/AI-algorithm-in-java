package geneticAlgorithm;

public class Population {

  private Individual[] Individuals;
  public Population(int populationSize){

    Individuals = new Individual(populationSize);

  }

  public void initializer(){

    for(int i=0;i<Individual.length;i++){
      Individual newIndividual = new Individual();
      newIndividual.generateIndividual();
      saveIndividual(i,newIndividual);

    }
  }


    public Individual getIndividual(int index){

      return this.Individual[index];
    }
}
