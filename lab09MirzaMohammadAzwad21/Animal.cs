using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab09MirzaMohammadAzwad21
{
    public class Animal
    {
        private string nameOfAnimal, habitat_area, sound;
        private int weight, height;
        private string birthYear;

        public Animal()
        {
            this.sound = "sound";
            this.birthYear = "2021";
        }

        public int getAge()
        {
            return Convert.ToInt32(DateTime.Now.Year) - Convert.ToInt32(birthYear);
        }

        public void changeWeight(int weight)
        {
            this.weight = weight;
        }
        
        public virtual void Vocalize()
        {
            Console.WriteLine(this.sound);
        }
        public string AnimalName
        {
            get { return nameOfAnimal; }
            set { nameOfAnimal = value; }
        }
        public string Habitat
        {
            get { return habitat_area; }
            set { habitat_area = value; }
        }
        public string Sound
        {
            get { return sound; }
            set { sound = value; }
        }
        public int Height
        {
            get { return height; }
            set { height = value; }
        }
        public int Weight
        {
            get
            {
                return weight;
            }
            set { weight = value; }
        }

        public void setBirthDate(string birthyear)
        {
            if (Convert.ToInt32(birthyear) > 2021)
            {
                birthYear = "2021";
            }
            else
            {
                birthYear = birthyear;
            }
        }

    }

    public class Cat : Animal
    {
        private Animal animal = new Animal();
        public Cat(string nameOfAnimal,string habitat_area, int height, int weight)
        {
            
            animal.AnimalName = nameOfAnimal;
            animal.Habitat = habitat_area;
            this.Sound = "Meow";
            animal.Height = height;
            animal.Weight = weight;

        }
        public string getInformation()
        {
            return "Name\tHabitat\tSound\tHeight\tWeight" + "\n" + animal.AnimalName + "\t" + animal.Habitat + "\t" + this.Sound + "\t" + animal.Height + "\t" + animal.Weight;
        }
    }

    public class Chicken : Animal
    {
        private Animal animal = new Animal();
        public Chicken(string nameOfAnimal, string habitat_area, int height, int weight)
        {

            animal.AnimalName = nameOfAnimal;
            animal.Habitat = habitat_area;
            this.Sound = "buck buck";
            animal.Height = height;
            animal.Weight = weight;

        }
        public string getInformation()
        {
            return "Name\tHabitat\tSound\tHeight\tWeight" + "\n" + animal.AnimalName + "\t" + animal.Habitat + "\t" + this.Sound + "\t" + animal.Height + "\t" + animal.Weight;
        }

    }
    public class Cow : Animal
    {
        private Animal animal = new Animal();
        public Cow(string nameOfAnimal, string habitat_area, int height, int weight)
        {

            animal.AnimalName = nameOfAnimal;
            animal.Habitat = habitat_area;
            this.Sound = "Moo";
            animal.Height = height;
            animal.Weight = weight;

        }
        public string getInformation()
        {
            return "Name\tHabitat\tSound\tHeight\tWeight" + "\n" + animal.AnimalName + "\t" + animal.Habitat + "\t" + this.Sound + "\t" + animal.Height + "\t" + animal.Weight;
        }
    }
    

}
