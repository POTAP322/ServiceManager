package service;

import technic.Technique;
//интерфейс для всех сервисов (в нём прописаны какие методы должны быть в каждом сервисе). В каждом классе сервиса он имплементируется
public interface Service {
    void repair(Technique technique); // абстрактный метод для починки техники

}
