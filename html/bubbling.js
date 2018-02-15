
function toggle(id, event, stopPropogation = false ) {
  if(stopPropogation) {
    event.stopPropagation();
  }
  document.getElementById(id).classList.toggle('colored');
}
