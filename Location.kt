val database = FirebaseDatabase.getInstance()
val locationRef = database.getReference("user_locations").child(userId)

// Get current location using FusedLocationProviderClient
// ...

// Update location in the database
locationRef.setValue(locationData)