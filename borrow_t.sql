USE [lib_db]
GO
/****** Object:  Table [dbo].[borrow_t]    Script Date: 2020/4/11 18:26:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[borrow_t](
	[BookNo] [nvarchar](10) NOT NULL,
	[ReaderNo] [nvarchar](10) NOT NULL,
	[BookName] [nvarchar](10) NOT NULL,
	[Author] [nvarchar](10) NULL,
	[BDate] [datetime] NOT NULL,
 CONSTRAINT [PK_borrow_t] PRIMARY KEY CLUSTERED 
(
	[BookNo] ASC,
	[ReaderNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
