function showDateLoop(times) {
    for (let i = 0; i < times; i++) {
        const today = new Date();
        const dd = String(today.getDate()).padStart(2, '0');
        const mm = String(today.getMonth() + 1).padStart(2, '0'); // Months are 0-based
        const yyyy = today.getFullYear();
        const formattedDate = `${dd}-${mm}-${yyyy}`;
        console.log(formattedDate);
    }
}

// Call the function
showDateLoop(3); // Change number to print more dates
