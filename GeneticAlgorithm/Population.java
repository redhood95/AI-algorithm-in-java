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

public Individual getFittestIndividual(){
  Individual fittest = individuals[0];
 for(int i=1;i<individuals.length;++i){

   if(getIndividual(i).getFitness() >= fittest.getFitness())
          fittest = getIndividual(i);
 }
  return fittest;
}

    public int size(){
      return this.individuals.length;
    }


      public void saveIndividual(int index, Individual individual){

        this.individual(index) = individual;
      }
}
