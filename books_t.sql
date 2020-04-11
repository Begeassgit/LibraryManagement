USE [lib_db]
GO
/****** Object:  Table [dbo].[books_t]    Script Date: 2020/4/11 15:57:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[books_t](
	[BookNo] [char](13) NOT NULL,
	[BookName] [nvarchar](10) NOT NULL,
	[Author] [nvarchar](10) NULL,
	[RoomNo] [nvarchar](10) NULL,
	[PublicInfo] [nvarchar](20) NULL,
	[BType] [nvarchar](10) NULL,
	[InBase] [smallint] NULL,
 CONSTRAINT [PK_books_t] PRIMARY KEY CLUSTERED 
(
	[BookNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [Bookindex]    Script Date: 2020/4/11 15:57:24 ******/
CREATE NONCLUSTERED INDEX [Bookindex] ON [dbo].[books_t]
(
	[BookName] ASC,
	[Author] ASC,
	[RoomNo] ASC,
	[PublicInfo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
