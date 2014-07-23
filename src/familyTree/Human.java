package familyTree;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Vector;



public class Human implements Serializable{
    String ID;
    String name;
    Boolean male;//male true, female false
    Date born;
    Date death;
    Human father,mother,spouse;
    Vector<Human> childrenList = new Vector<>();
    String biography;

    public Human(String ID, String name, Boolean male, Date born, Date death, Human father, Human mother, Human spouse, String biography) {
        this.ID = ID;
        this.name = name;
        this.male = male;
        this.born = born;
        this.death = death;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
        this.biography = biography;
    }

    Human() {
        
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setID(String ID) {
        this.ID = ID;
    }



    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Boolean isMale() {
        return male;
    }

    public Date getBorn() {
        return born;
    }

    public Date getDeath() {
        return death;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Human getSpouse() {
        return spouse;
    }

    public Vector<Human> getChildrenList() {
        return childrenList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public void setDeath(Date death) {
        this.death = death;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setSpouse(Human spouse) {
        this.spouse = spouse;
    }

    public void setChildrenList(Vector<Human> childrenList) {
        this.childrenList = childrenList;
    }

    public boolean addChild(Human child){
        if(child.born.before(this.born))
            return false;
        if(childrenList.indexOf(child) > -1) 
            return false;
        childrenList.add(child);
        return true;
    }
    public int checkValid(){
        if(father == mother )
            return 1;
        for(Human child : childrenList){
            if(child.born.before(this.born))
                return 2;
        }
        if(father != null && father.born.after(this.born) )
            return 3;
        if(mother != null && mother.born.after(this.born))
            return 4;
        
        if(this == this.spouse)
            return 5;
        return 0;
    }
    
    @Override
    public String toString(){
        return name;
    }

    public String relawith(Human other) {
       // if (other.getFather()==this) return "son";
       // if (other.getMother()==this) return "daughter";
      //  if ((other.getMother()==this.getMother())||
      //          (other.getFather()==this.getFather())) return "Sibling";
      //  if (father==other) return "father";
      //  if (mother==other) return "mother";
        
        return null;
        
    }
    
}
