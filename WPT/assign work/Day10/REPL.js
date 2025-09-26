function showDateLoop(times) {
    for (let i = 0; i < times; i++) {
        const today = new Date();
        const dd = String(today.getDate()).padStart(2, '0');
        const mm = String(today.getMonth() + 1).padStart(2, '0'); 
        const yy = today.getFullYear();
        const formattedDate = `${dd}-${mm}-${yy}`;
        console.log(formattedDate);
    }
}

showDateLoop(3); 
