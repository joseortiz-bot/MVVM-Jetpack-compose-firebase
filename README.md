# MVVM-Jetpack-compose-firebase
# App de Android y Firebase (Jetpack + Dagger). Patron MVVM + Clean Architecture, base de datos(Storage), authentication, navegación graph. 

### Pasos para configurar Firebase y GitHub

1. Estar registrado en Firebase.
2. Conectar Android Studio con GitHub.
3. Conectar Firebase con Android Studio:
   * Ve a Tools -> Firebase en Android Studio.
   * Selecciona Authentication y elige "Authenticate using a custom authentication system" con el mismo nombre de la app, por ejemplo, com.login.jetpackcompose.
4. Agregar los servicios necesarios en Firebase:
   * Authentication.
   * Firestore Database.
   * Storage.
5. Ajustar las reglas de Firestore Database y Storage en Firebase.

```
rules_version = '2';
service firebase.storage {
  match /b/{bucket}/o {
    match /{allPaths=**} {
      allow read, write: if request.auth != null
    }
  }
}
```
5.Despues publicar los cambios.

<img width="395" alt="Captura de pantalla 2023-10-27 a la(s) 20 44 52" src="https://github.com/joseortiz-bot/MVVM-Jetpack-compose-firebase/assets/52723657/b77ffbc4-2184-42b4-8d5e-78ad5111d503">
<img width="398" alt="Captura de pantalla 2023-10-27 a la(s) 20 46 36" src="https://github.com/joseortiz-bot/MVVM-Jetpack-compose-firebase/assets/52723657/38a46592-810d-4d1f-bc28-f3c4df0c9115">
<img width="397" alt="Captura de pantalla 2023-10-27 a la(s) 20 47 46" src="https://github.com/joseortiz-bot/MVVM-Jetpack-compose-firebase/assets/52723657/bc452f6d-b983-48f1-a378-93596646b84a">
<img width="393" alt="Captura de pantalla 2023-10-27 a la(s) 20 48 48" src="https://github.com/joseortiz-bot/MVVM-Jetpack-compose-firebase/assets/52723657/0651467d-ac32-4838-ab1e-9142e9c33169">
<img width="395" alt="Captura de pantalla 2023-10-27 a la(s) 20 50 04" src="https://github.com/joseortiz-bot/MVVM-Jetpack-compose-firebase/assets/52723657/d29c5b1c-6156-4a82-8fcb-6acc2677d0d3">
<img width="393" alt="Captura de pantalla 2023-10-27 a la(s) 20 51 34" src="https://github.com/joseortiz-bot/MVVM-Jetpack-compose-firebase/assets/52723657/c986fc03-756c-46c6-9000-e625fbcd34cd">
