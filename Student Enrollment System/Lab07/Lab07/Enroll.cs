using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Lab07_dependecies;

namespace Lab07
{
    public static class Enroll
    {
        public static List<Student>studentsList=new List<Student>();
        public static List<Professional>professionalList=new List<Professional>();
        public static List<Courses>coursesList=new List<Courses>();
        public static DateTime enrollmentDate = new DateTime();
        public static List<DateTime>dateList=new List<DateTime>();
        public static List<string>courseIDList=new List<string>();

    }
}
