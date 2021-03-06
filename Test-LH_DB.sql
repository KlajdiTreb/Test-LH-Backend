USE [test_LH]
GO
/****** Object:  Table [dbo].[Jobs]    Script Date: 5/5/2021 11:52:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Jobs](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NULL,
	[description] [varchar](150) NULL,
	[published] [date] NULL,
 CONSTRAINT [PK_JobsTable] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Roles]    Script Date: 5/5/2021 11:52:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Roles](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[roleName] [varchar](50) NULL,
 CONSTRAINT [PK_Roles] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Users]    Script Date: 5/5/2021 11:52:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Users](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NULL,
	[lastname] [varchar](50) NULL,
	[username] [varchar](50) NULL,
	[password] [varchar](50) NULL,
	[roleId] [int] NULL,
	[jobId] [int] NULL,
 CONSTRAINT [PK_UsersTable] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Jobs] ON 

INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (1, N'Physician Assistant', N'Work under doctors to care for the sick or injured by interpreting tests and conducting exams.', CAST(0x60420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (2, N'Software Developer', N'Work under doctors to care for the sick or injured by interpreting tests and conducting exams.', CAST(0x5C420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (3, N'Nurse Practitioner', N'Provide care to patients throughout the lifespan, from premature newborns to the elderly.', CAST(0x73420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (4, N'Medical and Health', N'Manage an entire facility, a specific clinical area or department', CAST(0x57420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (5, N'Physician', N'Provide preventative care but also teat and diagnose a range of illnesses in their patients', CAST(0x6C420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (6, N'Statistician', N'Statictics is the science of using data to make decisions', CAST(0x6A420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (7, N'Speech-Language', N'Diagnose and treat a variety of speech and language difficulties and can work in a number of settings', CAST(0x61420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (8, N'Data Scientist', N'Technology to glean insights from large amounts of data they collect', CAST(0x5A420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (9, N'Dentist', N'Examine and treat issues involving the mouth', CAST(0x64420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (10, N'Veterinarian', N'Surgeries or setting broken bones for animals', CAST(0x71420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (11, N'Orthodontist', N'Focus primarily on the teeth and jaw', CAST(0x60420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (12, N'IT Manager', N'Coordinate computer-related activities for an organization', CAST(0x66420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (13, N'Physical Therapist', N'Helping patients with their physical therapy plans', CAST(0x5A420B00 AS Date))
INSERT [dbo].[Jobs] ([id], [name], [description], [published]) VALUES (28, N'Prova', N'Prova100', CAST(0x6B430B00 AS Date))
SET IDENTITY_INSERT [dbo].[Jobs] OFF
SET IDENTITY_INSERT [dbo].[Roles] ON 

INSERT [dbo].[Roles] ([id], [roleName]) VALUES (1, N'Admin')
INSERT [dbo].[Roles] ([id], [roleName]) VALUES (2, N'User')
SET IDENTITY_INSERT [dbo].[Roles] OFF
SET IDENTITY_INSERT [dbo].[Users] ON 

INSERT [dbo].[Users] ([id], [name], [lastname], [username], [password], [roleId], [jobId]) VALUES (1, N'Heall', N'Fulks', N'fulks', N'1230', 1, NULL)
INSERT [dbo].[Users] ([id], [name], [lastname], [username], [password], [roleId], [jobId]) VALUES (2, N'Ludwig', N'Millhill', N'hill', N'1230', 1, 12)
INSERT [dbo].[Users] ([id], [name], [lastname], [username], [password], [roleId], [jobId]) VALUES (3, N'Ellerey', N'Greenham', N'elle', N'123', 2, NULL)
INSERT [dbo].[Users] ([id], [name], [lastname], [username], [password], [roleId], [jobId]) VALUES (4, N'Alanna', N'Oolahan', N'anna', N'123', 2, 4)
INSERT [dbo].[Users] ([id], [name], [lastname], [username], [password], [roleId], [jobId]) VALUES (5, N'Shirli', N'Samantha', N'shirli', N'123', 2, NULL)
INSERT [dbo].[Users] ([id], [name], [lastname], [username], [password], [roleId], [jobId]) VALUES (6, N'Dejni', N'Trebicka', N'denny4', N'123', 2, NULL)
SET IDENTITY_INSERT [dbo].[Users] OFF
ALTER TABLE [dbo].[Users]  WITH CHECK ADD  CONSTRAINT [FK_Users_Jobs] FOREIGN KEY([jobId])
REFERENCES [dbo].[Jobs] ([id])
GO
ALTER TABLE [dbo].[Users] CHECK CONSTRAINT [FK_Users_Jobs]
GO
ALTER TABLE [dbo].[Users]  WITH CHECK ADD  CONSTRAINT [FK_Users_Roles] FOREIGN KEY([roleId])
REFERENCES [dbo].[Roles] ([id])
GO
ALTER TABLE [dbo].[Users] CHECK CONSTRAINT [FK_Users_Roles]
GO
