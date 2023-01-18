const deleteButton = document.querySelector("button");

let modal;
let backdrop;

deleteButton.addEventListener("click", showModalHandler);

function showModalHandler() {
  if (modal) return;

  modal = document.createElement("div");
  modal.className = "modal";

  const modalText = document.createElement("p");
  modalText.textContent = "Are you sure?";

  const modaCancelAction = document.createElement("button");
  modaCancelAction.textContent = "cancel";
  modaCancelAction.className = "btn btn--alt";
  modaCancelAction.addEventListener("click", closeModalHandler);

  const modalConfirmationAction = document.createElement("button");
  modalConfirmationAction.textContent = "Confirm";
  modalConfirmationAction.className = "btn";
  modalConfirmationAction.addEventListener("click", closeModalHandler);

  modal.append(modalText);
  modal.append(modaCancelAction);
  modal.append(modalConfirmationAction);

  document.body.append(modal);

  backdrop = doument.createElement("div");
  backdrop.className = "backdrop";

  backdrop.addEventListener("click", closeModalHandler);
  document.body.append(backdrop);
}

function closeModalHandler() {
  modal.remove();
  modal = null;
  backdrop.remove();
  backdrop.null;
}
