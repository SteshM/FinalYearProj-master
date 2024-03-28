--
-- PostgreSQL database dump
--

-- Dumped from database version 12.18 (Ubuntu 12.18-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.18 (Ubuntu 12.18-0ubuntu0.20.04.1)

-- Started on 2024-03-28 10:54:04 EAT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3048 (class 0 OID 221453)
-- Dependencies: 206
-- Data for Name: assignments; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3054 (class 0 OID 229578)
-- Dependencies: 212
-- Data for Name: content; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3055 (class 0 OID 229594)
-- Dependencies: 213
-- Data for Name: contenttype; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.contenttype (contenttypeid, contenttypename) VALUES (1, 'Video');
INSERT INTO public.contenttype (contenttypeid, contenttypename) VALUES (2, 'PDF');


--
-- TOC entry 3049 (class 0 OID 221460)
-- Dependencies: 207
-- Data for Name: grades; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.grades ("gradeId", "gradeName") VALUES (1, 'Grade 1');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (2, 'Pre-Primary 2');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (3, 'Grade 1');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (4, 'Grade 2');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (5, 'Grade 3');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (6, 'Grade 4');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (7, 'Grade 5');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (8, 'Grade 6');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (9, 'Grade 7');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (10, 'Grade 8');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (11, 'Grade 9');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (12, 'Grade 10');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (13, 'Grade 11');
INSERT INTO public.grades ("gradeId", "gradeName") VALUES (14, 'Grade 12');


--
-- TOC entry 3047 (class 0 OID 221447)
-- Dependencies: 205
-- Data for Name: lessons; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3045 (class 0 OID 221393)
-- Dependencies: 203
-- Data for Name: levels; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.levels ("levelId", "levelName") VALUES (1, 'Pre-Primary');
INSERT INTO public.levels ("levelId", "levelName") VALUES (2, 'Primary');
INSERT INTO public.levels ("levelId", "levelName") VALUES (3, 'Junior Primary');
INSERT INTO public.levels ("levelId", "levelName") VALUES (4, 'Senior Secondary');


--
-- TOC entry 3051 (class 0 OID 221480)
-- Dependencies: 209
-- Data for Name: parents; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3050 (class 0 OID 221477)
-- Dependencies: 208
-- Data for Name: students; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3044 (class 0 OID 221390)
-- Dependencies: 202
-- Data for Name: subjects; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (1, 'Mathematics', 1);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (2, 'English', 1);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (3, 'Environment', 1);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (4, 'Religion', 1);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (6, 'Mathematics', 2);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (7, 'Creative Arts', 2);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (8, 'English', 2);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (9, 'social Studies', 2);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (10, 'Religious Studies', 2);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (11, 'natural Environment', 2);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (12, 'Agriculture', 2);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (13, 'Mathematics', 3);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (14, 'Mathematics', 3);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (15, 'HomeScience', 3);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (16, 'Creative Activities', 3);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (17, 'Health education', 3);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (18, 'Kiswahili', 3);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (19, 'Physical Education', 3);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (20, 'Mathematics', 4);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (21, 'Geography', 4);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (22, 'History and citizenship', 4);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (23, 'Intergrated Science', 4);
INSERT INTO public.subjects ("subjectId", "subjectName", "levelId") VALUES (24, 'Sports Activities', 4);


--
-- TOC entry 3046 (class 0 OID 221402)
-- Dependencies: 204
-- Data for Name: topics; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3052 (class 0 OID 221483)
-- Dependencies: 210
-- Data for Name: tutors; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3053 (class 0 OID 221498)
-- Dependencies: 211
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3056 (class 0 OID 229602)
-- Dependencies: 214
-- Data for Name: usertype; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.usertype (usertypeid, usertypename) VALUES (1, 'Tutor');
INSERT INTO public.usertype (usertypeid, usertypename) VALUES (2, 'Parent');
INSERT INTO public.usertype (usertypeid, usertypename) VALUES (3, 'Student');


--
-- TOC entry 3065 (class 0 OID 0)
-- Dependencies: 215
-- Name: assignments_assignmentsid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.assignments_assignmentsid_seq', 1, false);


-- Completed on 2024-03-28 10:54:05 EAT

--
-- PostgreSQL database dump complete
--

