const BASE_URL = "http://localhost:8080";

const getHeaders = () => ({
  "Content-Type": "application/json",
});

// ─── Auth ───────────────────────────────────────────────────────────────────
export const register = (data) =>
  fetch(`${BASE_URL}/auth/register`, {
    method: "POST",
    headers: getHeaders(),
    body: JSON.stringify(data),
  }).then((r) => r.text());

export const login = (data) =>
  fetch(`${BASE_URL}/auth/login`, {
    method: "POST",
    headers: getHeaders(),
    body: JSON.stringify(data),
  }).then((r) => r.json());

// ─── Dashboard ───────────────────────────────────────────────────────────────
export const getDashboard = (userId) =>
  fetch(`${BASE_URL}/dashboard?userId=${userId}`, { headers: getHeaders() }).then((r) => r.json());

// ─── Tasks ───────────────────────────────────────────────────────────────────
export const getTasks = (userId) =>
  fetch(`${BASE_URL}/task?userId=${userId}`, { headers: getHeaders() }).then((r) => r.json());

export const addTask = (data) =>
  fetch(`${BASE_URL}/task`, {
    method: "POST",
    headers: getHeaders(),
    body: JSON.stringify(data),
  }).then((r) => r.json());

export const updateTask = (id, data) =>
  fetch(`${BASE_URL}/task/${id}`, {
    method: "PUT",
    headers: getHeaders(),
    body: JSON.stringify(data),
  }).then((r) => r.json());

export const deleteTask = (id) =>
  fetch(`${BASE_URL}/task/${id}`, {
    method: "DELETE",
    headers: getHeaders(),
  }).then((r) => r.json());

export const completeTask = (id) =>
  fetch(`${BASE_URL}/task/complete/${id}`, {
    method: "PUT",
    headers: getHeaders(),
  }).then((r) => r.json());

// ─── Calendar / Events ───────────────────────────────────────────────────────
export const getEvents = (userId) =>
  fetch(`${BASE_URL}/calendar?userId=${userId}`, { headers: getHeaders() }).then((r) => r.json());

export const addEvent = (data) =>
  fetch(`${BASE_URL}/calendar`, {
    method: "POST",
    headers: getHeaders(),
    body: JSON.stringify(data),
  }).then((r) => r.json());

// ─── Journal ─────────────────────────────────────────────────────────────────
export const getJournals = (userId) =>
  fetch(`${BASE_URL}/journal?userId=${userId}`, { headers: getHeaders() }).then((r) => r.json());

export const addJournal = (data) =>
  fetch(`${BASE_URL}/journal`, {
    method: "POST",
    headers: getHeaders(),
    body: JSON.stringify(data),
  }).then((r) => r.json());

// Uploads a single image file for a journal entry.
// Note: no Content-Type header here — the browser sets the correct
// multipart boundary automatically when you pass a FormData body.
export const uploadJournalImage = (file) => {
  const formData = new FormData();
  formData.append("file", file);

  return fetch(`${BASE_URL}/upload/image`, {
    method: "POST",
    body: formData,
  }).then((r) => r.json());
};

// ─── Mood ─────────────────────────────────────────────────────────────────────
export const getMoods = (userId) =>
  fetch(`${BASE_URL}/mood?userId=${userId}`, { headers: getHeaders() }).then((r) => r.json());

export const addMood = (data) =>
  fetch(`${BASE_URL}/mood`, {
    method: "POST",
    headers: getHeaders(),
    body: JSON.stringify(data),
  }).then((r) => r.json());

// ─── Finance ─────────────────────────────────────────────────────────────────
export const getExpenses = (userId) =>
  fetch(`${BASE_URL}/finance?userId=${userId}`, { headers: getHeaders() }).then((r) => r.json());

export const addExpense = (data) =>
  fetch(`${BASE_URL}/finance`, {
    method: "POST",
    headers: getHeaders(),
    body: JSON.stringify(data),
  }).then((r) => r.json());

// ─── AI Chat ─────────────────────────────────────────────────────────────────
export const aiChat = (message, userId) =>
  fetch(`${BASE_URL}/ai/chat`, {
    method: "POST",
    headers: getHeaders(),
    body: JSON.stringify({ message, userId }),
  }).then((r) => r.json());

// ─── Memory ──────────────────────────────────────────────────────────────────
export const memoryRecall = (question) =>
  fetch(`${BASE_URL}/memory`, {
    method: "POST",
    headers: getHeaders(),
    body: JSON.stringify({ question }),
  }).then((r) => r.json());

// ─── Weekly Report ───────────────────────────────────────────────────────────
export const sendWeeklyReportNow = (userId) =>
  fetch(`${BASE_URL}/report/weekly/${userId}`, {
    method: "POST",
    headers: getHeaders(),
  }).then((r) => r.json());
