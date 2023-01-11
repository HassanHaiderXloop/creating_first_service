// package com.firstervice.creating_first_service;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

// @Entity
// public class Movies {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String Title;
//     private int ReleasedYear;
//     private String Genre;
//     private String Runtime;

//     protected Movies(){

//     }

//     public Movies(String Title , int ReleasedYear, String Genre, String Runtime ) {
//         this.Title = Title;
//         this.ReleasedYear = ReleasedYear;
//         this.Genre = Genre;
//         this.Runtime = Runtime;   
//     }

//     public String getTitle() {
//         return Title;
//     }
//     public void setTitle(String title) {
//         Title = title;
//     }
//     public int getReleasedYear() {
//         return ReleasedYear;
//     }
//     public void setReleasedYear(int releasedYear) {
//         ReleasedYear = releasedYear;
//     }
//     public String getGenre() {
//         return Genre;
//     }
//     public void setGenre(String genre) {
//         Genre = genre;
//     }
//     public String getRuntime() {
//         return Runtime;
//     }
//     public void setRuntime(String runtime) {
//         Runtime = runtime;
//     }


// }
