package FactoryPattern_Project;

public abstract class FactoryWorker{
    abstract Worker createWorker(String name, int age); // Bu metod Worker constructoriga qiymat beradi faqat bu yerda emas WorkCreator buni implementatsiya qilib bu metodni ishlatish orqali qiymat berayapti!
    Worker createWorkerWrapper(String name, int age){//Buni aynan nima amal bajarayotganiga va nima uchun ishlatilishiga shunmadim
        return createWorker(name,age);
    }
}
