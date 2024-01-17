package com.example.mynoteapp.data

import com.example.mynoteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A good day", description = "We went on a vacation this week"),

            Note(
                title = "Exploring Nature",
                description = "Took a hike in the mountains and enjoyed breathtaking views."
            ),
            Note(
                title = "Family Picnic",
                description = "Spent the day at the park with loved ones, playing games and sharing laughter."
            ),
            Note(
                title = "Learning Adventure",
                description = "Visited a museum to explore art and history exhibits."
            ),
            Note(
                title = "Beach Day",
                description = "Relaxed by the ocean, building sandcastles and enjoying the sea breeze."
            ),
            Note(
                title = "City Exploration",
                description = "Explored the city streets, tried new restaurants, and visited local landmarks."
            ),
            Note(
                title = "Movie Marathon",
                description = "Had a cozy day at home watching favorite movies and snacking."
            ),
            Note(
                title = "Culinary Delights",
                description = "Experimented with new recipes and had a delightful home-cooked meal."
            ),
            Note(
                title = "Fitness Challenge",
                description = "Tried a new workout routine and felt the burn."
            ),
            Note(
                title = "Bookworm Retreat",
                description = "Spent the day immersed in a good book at the local library."
            ),
            Note(
                title = "Music Festival",
                description = "Attended a vibrant music festival, danced the night away with friends."
            ),
        )
    }
}