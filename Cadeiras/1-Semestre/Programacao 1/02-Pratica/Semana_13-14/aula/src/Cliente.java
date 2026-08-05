public class Cliente extends Pessoa {

  private int idade;
  // A associação "uma pessoa tem vários pets"
  // O cliente pode ter + de um pet
  // array de objetos
  private Pet[] pets;
  private int quantPet = 0;

  public Cliente(String nome, int idade, String endereco) {
    super(nome, endereco);
    this.idade = idade;
  }

  public Cliente(String nome, int idade, String endereco, int quantPet) {
    super(nome, endereco);
    this.idade = idade;
    this.pets = new Pet[quantPet];
  }

  public Cliente(String nome, int idade, String endereco, Pet[] pets) {
    super(nome, endereco);
    this.idade = idade;
    this.pets = pets;
  }

  public Pet[] getPet() {
    return this.pets;
  }

  public void setPet(Pet[] pet) {
    this.pets = pet;
  }

  public boolean hasPet(){
    return !(pets.length == 0);
  }

  public boolean inserirPet(Pet aPet) {
    if (quantPet < pets.length) {
      pets[quantPet++] = aPet;
      return true;
    }
    return false;
  }

  public boolean removePet(Pet aPet) {
    for (int i = 0; i < pets.length; i++) {
      if (pets[i] != null && pets[i].getNome().equals(aPet.getNome())) {
        pets[i] = null;
        quantPet--;
        return true;
      }
    }
    return false;
  }

  public Pet buscaPet(Pet aPet) {
    for (int i = 0; i < pets.length; i++) {
      if (pets[i] != null && pets[i].getNome().equals(aPet.getNome())) {
        return pets[i];
      }
    }
    return null;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Cliente {");
    sb.append("Nome: ").append(getNome()).append(", ");
    sb.append("Idade: ").append(idade).append(", ");
    sb.append("Endereço: ").append(getEndereco()).append(", ");
    sb.append("Pets: [");

    if (pets != null) {
      for (int i = 0; i < quantPet; i++) {
        if (pets[i] != null) {
          sb.append(pets[i].toString());
          if (i < quantPet - 1) {
            sb.append(", ");
          }
        }
      }
    }

    sb.append("]");
    sb.append("}");
    return sb.toString();
  }
}
